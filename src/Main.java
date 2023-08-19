public class Main {
    public static void main(String[] args) {

        String str = "Как ныне сбирается вещий Олег отмстить неразумным хазарам. " +
                "Их села и нивы за буйный набег обрек он мечам и пожарам.";

        int middleIndex = str.length() / 2;

        String firstHalf = str.substring(0,middleIndex);
        String secondHalf = str.substring(middleIndex);

        System.out.println("Первая половина строки: " + firstHalf);
        System.out.println("Вторая половина строки: " + secondHalf);
    }
}

