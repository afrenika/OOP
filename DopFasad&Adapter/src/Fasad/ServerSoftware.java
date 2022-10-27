package Fasad;

public class ServerSoftware {

    HandlerProgram handlerProgram;

    public ServerSoftware(HandlerProgram handlerProgram) {
        this.handlerProgram = handlerProgram;
    }

    public void requestProcessing(){
        System.out.println("обработка запроса");
        handlerProgram.requestProcessing();
    }


}
