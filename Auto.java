public class Auto {
    private String number;
    private String marka;
    private String color;

    public Auto(String number, String marka, String color) {
        this.number = number;
        this.marka = marka;
        this.color = color;
    }
    public String getNumber() {
        return number;
    }
    public String getMarka() {
        return marka;
    }
    public String getColor() {
        return color;
    }
    @Override
    public String toString() {
        return "Номера: " + number +
                ". Марка: " + marka +
                ". Цвет: " + color;
    }

}