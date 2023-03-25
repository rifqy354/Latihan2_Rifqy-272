import java.util.ArrayList;

public class CthArrayList {
    public static void main(String[] args) {
        ArrayList<String> Hewan = new ArrayList<>();

        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");

        System.out.println(Hewan);

        ArrayList<String> DeleteHewan = new ArrayList<>();

        DeleteHewan.add("Sapi");
        DeleteHewan.add("Kelinci");
        DeleteHewan.add("Kambing");
        DeleteHewan.add("Unta");
        DeleteHewan.add("Domba");

        DeleteHewan.remove("Kelinci");
        DeleteHewan.remove("Kambing");
        DeleteHewan.remove("Unta");

        System.out.println(DeleteHewan);

    }
}