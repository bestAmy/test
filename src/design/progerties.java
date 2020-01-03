package design;

import java.io.InputStream;

public class progerties {
    public void read(String fileUrl){
        InputStream ins=progerties.class.getResourceAsStream(fileUrl);
        CustomerInof customerInof=new CustomerInof();

    }
}
