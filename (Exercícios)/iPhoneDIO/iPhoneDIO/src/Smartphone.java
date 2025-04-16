public class Smartphone implements MusicPlayer, Phone, BrowseWeb {
    private DeviceState state;

    //Os métodos abaixo são referentes à interface MusicPlayer
    public void playMusic() {
        System.out.println("Tocando música");
        state = new DeviceState(StateType.PLAYING);
    }
    public void pauseMusic() {
        System.out.println("Música pausada");
        state = new DeviceState(StateType.PAUSED);
    }
    public void stopMusic() {
        System.out.println("Encerrando a música");
        state = new DeviceState(StateType.STOPPED);
    }
    public void nextSong() {
        System.out.println("Passando para próxima música");
    }
    public void previousSong() {
        System.out.println("Voltando para a música anterior");
    }
    public void resumeMusic() {
        System.out.println("Resumindo a música pausada");
        state = new DeviceState(StateType.PLAYING);
    }

    //Os métodos abaixo são referentes à interface Phone.
    public void makeCall() {
        System.out.println("Ligando para o contato");
    }
    public void receiveCall() {
        System.out.println("Recebendo ligação do contato");
        state = new DeviceState(StateType.RECEIVING_CALL);
    }
    public void sendSMS() {
        System.out.println("SMS enviado");
    }
    public void receiveSMS() {
        System.out.println("SMS recebido");
    }
    public void endCall() {
        System.out.println("Encerrando ligação");
    }
    public void holdCall() {
        System.out.println("Pausando ligação");
    }
    public void loudSpeaker() {
        System.out.println("Ligação em viva-voz");
    }

    //Os métodos abaixo são referentes à interface BrowseWeb
    public void openBrowser() {
        System.out.println("Abrindo navegador");
    }
    public void browseWeb() {
        System.out.println("Navegando na internet");
        state = new DeviceState (StateType.SURFING_WEB);
    }
    public void searchWeb() {
        System.out.println("Buscando no motor de buscas");
    }
    public void closeBrowser() {
        System.out.println("Fechando o navegador");
    }
}
