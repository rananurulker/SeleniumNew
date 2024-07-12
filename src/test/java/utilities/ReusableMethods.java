package utilities;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ReusableMethods {
    //verilen ewbelementlerinden olusan listeyi
    //stringlerden olusan bir liste olarak kaydedip bize dondursun

    public static List<String> getStringList(List<WebElement>kaynakList){
        List<String> stringList=new ArrayList<>();
        for (WebElement eachElements : kaynakList) {
            stringList.add(eachElements.getText());

        }
    return stringList;
    }
}
