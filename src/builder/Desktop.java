package builder;

public class Desktop {
    String ram;
    String cpu;
    String hardDisk;
    String graphicsCard;
    String speaker;
    String usb;

    private Desktop(String ram, String cpu, String hardDisk, String graphicsCard, String speaker, String usb) {
        this.ram = ram;
        this.cpu = cpu;
        this.hardDisk = hardDisk;
        this.graphicsCard = graphicsCard;
        this.speaker = speaker;
        this.usb = usb;
    }

    private Desktop(Builder builder) {
        this(builder.ram, builder.cpu, builder.hardDisk, builder.graphicsCard, builder.speaker, builder.usb);
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "ram='" + ram + '\'' +
                ", cpu='" + cpu + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", speaker='" + speaker + '\'' +
                ", usb='" + usb + '\'' +
                '}';
    }

    static final class Builder {
        private String ram;
        private String cpu;
        private String hardDisk;
        private String graphicsCard;
        private String speaker;
        private String usb;

        Builder() {
            ram = null;
            cpu = null;
            hardDisk = null;
            graphicsCard = null;
            speaker = null;
            usb = null;
        }

        Builder putRam(String val) {
            ram = val;
            return this;
        }

        Builder putCpu(String val) {
            cpu = val;
            return this;
        }

        Builder putHardDisk(String val) {
            hardDisk = val;
            return this;
        }

        Builder putGraphicsCard(String val) {
            graphicsCard = val;
            return this;
        }

        Builder putSpeaker(String val) {
            speaker = val;
            return this;
        }

        Builder putUsb(String val) {
            usb = val;
            return this;
        }

        Desktop build() {
            return new Desktop(this);
        }
    }
}
