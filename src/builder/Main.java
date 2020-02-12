package builder;

public class Main {
    public static void main(String[] args) {
        Desktop desktop = new Desktop.Builder()
                .putCpu("intel i7")
                .putGraphicsCard("nvidia 940 mx")
                .putUsb("3.0")
                .putRam("2GB DDR")
                .putHardDisk("256 GB SSD")
                .build();
        System.out.println(desktop);

        desktop = new Desktop.Builder()
                .putCpu("intel i3")
                .putGraphicsCard("nvidia 960 mx")
                .putUsb("2.0")
                .putRam("3GB DDR")
                .build();
        System.out.println(desktop);
    }
}
