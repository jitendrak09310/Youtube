package practice3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BatchProcessingUsingExecutorService {

	public static final int TOTOL_RECORDS = 1_000_000;
	public static final int BATCH_SIZE = 10_000;

	public static void main(String[] args) throws InterruptedException {

		List<Data> data = generateRecords(TOTOL_RECORDS);

		ExecutorService executorService = Executors.newFixedThreadPool(10);
		long start = System.currentTimeMillis();

		for (int i = 0; i < data.size(); i += BATCH_SIZE) {

			int startIndex = i;
			int endindex = Math.min(i + BATCH_SIZE, data.size());
			List<Data> batch = data.subList(startIndex, endindex);
			executorService.submit(() -> saveDataBatch(batch));
		}
		executorService.shutdown();
		executorService.awaitTermination(10, TimeUnit.SECONDS);

		long end = System.currentTimeMillis();

		System.out.println("Processing completed in " + (end - start) + " ms");

	}

	public static void saveDataBatch(List<Data> batch) {

		try {
			Thread.sleep(50);
			System.out.println(Thread.currentThread().getName() + " processed batch size: " + batch.size());
		} catch (Exception e) {
			Thread.currentThread().interrupt();
		}

	}

	public static List<Data> generateRecords(int totalRecords) {

		ArrayList<Data> records = new ArrayList<>();

		for (int i = 0; i < totalRecords; i++) {
			records.add(new Data(i, "name-" + i));
		}

		return records;

	}

	static class Data {
		int id;
		String name;

		Data(int id, String name) {
			this.id = id;
			this.name = name;
		}
	}

}
