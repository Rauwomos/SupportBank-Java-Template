package training.supportbank;

import java.util.Objects;

public class Monies {

    private Integer characteristic;
    private Integer mantissa;

    public Monies(Integer characteristic, Integer mantissa) {
        this.characteristic = characteristic;
        this.mantissa = mantissa;
    }

    public Monies(Integer characteristic) {
        this.characteristic = characteristic;
        this.mantissa = 0;
    }

    public void add(Monies monies) {
        this.characteristic += monies.getCharacteristic();
        this.mantissa += monies.getMantissa();
        if (this.mantissa >= 100) {
            this.characteristic += this.mantissa/100;
            this.mantissa = this.mantissa%100;
        } else if (this.mantissa < 0) {
            this.characteristic -= (Math.abs(this.mantissa)/100) + 1;
            this.mantissa += this.mantissa%100 + 100;
        }
    }

    public void subtract(Monies monies) {
        this.characteristic -= monies.getCharacteristic();
        this.mantissa -= monies.getMantissa();
    }

    public Integer getCharacteristic() {
        return this.characteristic;
    }

    public Integer getMantissa() {
        return this.mantissa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monies monies = (Monies) o;
        return Objects.equals(characteristic, monies.characteristic) &&
                Objects.equals(mantissa, monies.mantissa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(characteristic, mantissa);
    }

    @Override
    public String toString() {
        return this.characteristic.toString() + "." + String.valueOf(Math.abs(this.mantissa));
    }
}
