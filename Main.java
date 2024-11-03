import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Создаем список машин с разными номерами, брендами и цветами
        List<Auto> autos = new ArrayList<>();
        autos.add(new Auto("А433КН", "Волга", "Красный"));
        autos.add(new Auto("В4765ЛВ", "БМВ", "Синий"));
        autos.add(new Auto("М5486ОС", "Мерседес", "Зеленый"));
        autos.add(new Auto("АН4337ИН", "Жигули", "Белый"));
        Map<String, Auto> mapPoNumber = sozdatMapNumber(autos);
        System.out.println("--------ПО НОМЕРАМ---------");
        System.out.println(mapPoNumber);
        Map<String, List<Auto>> mapPoMarke = sozdatMapMarka(autos);//получить мап по марке
        System.out.println("----ПО МАРКЕ------");
        System.out.println(mapPoMarke);
    }
    public static Map<String, Auto> sozdatMapNumber(List<Auto> autos) {//сделать номера ключами
        Map<String, Auto> mapPoNumber = new HashMap<>();
        for (Auto auto : autos) {
            mapPoNumber.put(auto.getNumber(), auto);//добавляем(ключ — номер, а значение это объект класса авто)
        }
        return mapPoNumber;
    }
    public static Map<String, List<Auto>> sozdatMapMarka(List<Auto> autos) {//ключ-марка
        Map<String, List<Auto>> mapPoMarke = new HashMap<>();
        for (Auto auto : autos) {
            if (!mapPoMarke.containsKey(auto.getMarka())) {
                mapPoMarke.put(auto.getMarka(), new ArrayList<>());
            }
            mapPoMarke.get(auto.getMarka()).add(auto);
        }
        return mapPoMarke;
    }
}
