import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;


public class JsonFileReadExample {
    public static void main(String[] args)throws IOException{
        try {
            URL url = JsonFileReadExample.class.getResource("file.json");           //dosya URL sini aldık
            String path = url.getPath();                                                  //dosya yolunu string tipindeki değişkene attık
            System.out.println(path);                                                     //dosya yolunu ekrana bastırdık

            FileReader reader = new FileReader(path);                                     //dosya yolundaki dosyayı okuyup reader adındaki objeye implemente ettik

            JSONParser jsonParser = new JSONParser();                                     //JSON tipindeki dosyayla işlemler yapabilmek için JSONParser sınıfını kullandık

            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);                //
            JSONArray content = (JSONArray) jsonObject.get("content");
            Object totalPage = jsonObject.get("totalPages");

                for (int i = 0; i < content.size(); i++) {
                    JSONObject contentId = (JSONObject) (content.get(i));
                    JSONObject id = (JSONObject) (contentId.get("id"));
                    System.out.println( i + ". providerId of the id number is " + id.get(("providerId")));
                    JSONObject contentProvider = (JSONObject) content.get(i);
                    JSONObject provider = (JSONObject) contentProvider.get("provider");
                    System.out.println(i + ". id of the provider number is : " + provider.get("id"));
                }

            System.out.println("------------------------");
            System.out.println(totalPage);



        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}
