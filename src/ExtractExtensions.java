public class ExtractExtensions {

    void extractData(String[] app){


        for(String element : app){
            int idx = element.indexOf('.');
            String subString = element.substring(idx);
            System.out.println(subString);
        }
    }

    public static void main(String... args){
        String[] string = {"apple.jpg", "mango.png", "myFile.exe", "Jdk.java", "android.apk", "bananna.jpg"};
        ExtractExtensions ec = new ExtractExtensions();
        ec.extractData(string);



    }
}
