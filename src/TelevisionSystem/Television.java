package TelevisionSystem;

public class Television {

        private boolean isOn;
        private int volume;
        private int channel;

        private static final int MIN_VOLUME=0;
        private  static final int MAX_VOLUME=100;

        public Television() {
            isOn = false;
            volume = 10;
            channel = 1;
        }
        public void turnOn() {
            isOn = true;
        }
        public void turnOff() {
            isOn = false;
        }
        public boolean isOn() {
            return isOn;
        }
        public int getVolume() {
            return volume;
        }

        public int getChannel() {
            return channel;
        }

        public void increaseVolume() {
            if (!isOn) return;

            if (volume < MAX_VOLUME) {
                volume++;
            }
        }

        public void decreaseVolume() {
            if (!isOn) return;

            if (volume > MIN_VOLUME) {
                volume--;
            }
        }

        public void changeChannel(int newChannel) {
            if (!isOn) return;

            if (newChannel > 0) {
                channel = newChannel;
            }
        }
    }






