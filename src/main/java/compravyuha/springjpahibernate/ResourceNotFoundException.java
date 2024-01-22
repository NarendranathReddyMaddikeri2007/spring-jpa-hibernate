package compravyuha.springjpahibernate;


import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class ResourceNotFoundException extends RuntimeException{
   private static final int serialVersionUID = 1;

   public ResourceNotFoundException(String message){
       super(message);
   }

   public ResourceNotFoundException(String message, Throwable throwable){
       super(message,throwable);
   }
}
