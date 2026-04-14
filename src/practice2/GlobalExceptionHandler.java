//package practice2;
//
//@RestControllerAdvice
//public class GlobalExceptionHandler extends Exception {
//
//	@ExceptionHandler(Exception.class)
//	public ReponseEntity<ErrorResponse> handleGlobalException(Exception e) {
//		ErrorResponse er = new ErrorResponse("Something went wrong " + Httpstatus.INTERNAL.SERVER.ERROR.value());
//		return new ErrorResponse<>(er, Httpstatus.INTERNAL.SERVER.ERROR);
//	}
//
//}
