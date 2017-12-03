import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by Евген on 03.12.2017.
 */
public class ReadTxt {
    private static String fileAdress(){
        System.out.print("Enter file directory: ");
        Scanner sc = new Scanner(System.in);
        String adress = sc.nextLine();
        return adress;
    }

    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(new FileReader(fileAdress())))
        {
            String s;
            HashMap<String,Integer> myMap = new HashMap<>();
            while(( s = br.readLine() ) != null) {

                System.out.println("\n" +s);

                for (String countKeyRepeat : s.toLowerCase().replaceAll("\\p{P}","").split(" ")) {
                    myMap.get(countKeyRepeat);
                    if (! myMap.containsKey(countKeyRepeat)){
                        myMap.put(countKeyRepeat,1);
                    } else {
                        myMap.put(countKeyRepeat,myMap.get(countKeyRepeat)+1);
                    }
                }
                System.out.print("\n" +myMap +"\n");

                List sortList = new ArrayList(myMap.entrySet());
                Collections.sort(sortList, new Comparator <Map.Entry<String,Integer>>() {

                    @Override
                    public int compare(Map.Entry<String,Integer> e1, Map.Entry<String,Integer> e2) {
                        return e2.getValue().compareTo(e1.getValue());
                    }
                });
                System.out.println("\nSort: " +sortList);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
//            String Str = new String("Добро-пожаловать-на-ProgLang.su");
//
//            System.out.println("Возвращаемое значение: ");
//            for (String retval : Str.split("-", 2)) {
//                System.out.println(retval);
//            }
//            System.out.println();
//            System.out.println("Возвращаемое значение: ");
//            for (String retval : Str.split("-", 3)) {
//                System.out.println(retval);
//            }
//            System.out.println();
//            System.out.println("Возвращаемое значение: ");
//            for (String retval : Str.split("-", 0)) {
//                System.out.println(retval);
//            }
//            System.out.println();
//            System.out.println("Возвращаемое значение: ");
//            for (String retval : Str.split("-")) {
//                System.out.println(retval);
//
//        }

//
//        try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Евген\\Desktop\\Java8.txt")))
//        {
//            String text = "Привет мир!";
//            bw.write(text);
//        }
//        catch(IOException ex){
//
//            System.out.println(ex.getMessage());
//        }


//        try(FileReader reader = new FileReader("C:\\Users\\Евген\\Desktop\\Java8.txt"))
//        {
//        // читаем посимвольно
//            int c;
//            while((c=reader.read()) != -1 ){            // почему -1 ???
////                HashMap<Character, Integer> myMap = new HashMap<>();
////                Integer frequency = myMap.get(c);
////                myMap.put(c, frequency == null ? 1 : frequency + 1);
//               // myMap.put("они", );
//               // System.out.println(myMap.get("они"));
//                //System.out.print((char)c);
//                String b = Character.toString((char)c);
//                HashMap<String, String> myMap = new HashMap<>();
//                String a = myMap.get();
//                myMap.put(a, b);
//                System.out.println(myMap);
//            }
//        }
//        catch(IOException ex){
//            System.out.println(ex.getMessage());
//        }


//        Random random = new Random(36);
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        for (int i = 0; i < 10; i++){
//            // Создадим число от 0 до 10
//            int number = random.nextInt(10);
//            System.out.println(number);
//            Integer frequency = hashMap.get(number);
//            hashMap.put(number, frequency == null ? 1 : frequency + 1);
//        }
//        System.out.println(hashMap);


        // }


//    public static void main(String[] args) {
//
//        try {
//
//            File directory = new File("C:\\Users\\Евген\\Desktop");
//            File file = new File(directory, "Java8.txt");
//            FileReader fileReader = new FileReader(file);
//
//            BufferedReader reader = new BufferedReader(fileReader);
//
//            String line = null;
//
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//
////                HashMap<String, String> myMap = new HashMap<>();
////                myMap.put("они", line);
////                System.out.println(myMap.get("они"));
//            }
//            reader.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//
//
////        HashMap<String, String> myMap = new HashMap<>();
////        myMap.put("Russia", line);
////        //myMap.put("Russia", "Moscow");
////        //...
////        System.out.println(myMap.get("Russia"));
////    }
//    }

//        HashMap<String, Integer> hashMap = new HashMap<>();
//
//// Помещаем данные на карточку
//        hashMap.put("Васька", 5);
//        hashMap.put("Мурзик", 8);
//        hashMap.put("Рыжик", 12);
//        hashMap.put("Барсик", 5);
//
//// Получаем набор элементов
//        Set<HashMap.Entry<String, Integer>> set = hashMap.entrySet();
//
//// Отобразим набор
//        for (Map.Entry<String, Integer> me : set) {
//            System.out.print(me.getKey() + ": ");
//            System.out.println(me.getValue());
//        }
//
//// Добавляем значение
//        int value = hashMap.get("Рыжик");
//        hashMap.put("Рыжик", value + 3);
//        System.out.println("У Рыжика стало " + hashMap.get("Рыжик"));
    }
}
