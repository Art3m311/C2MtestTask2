package testProject;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class DownloadImage {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        download("https://images.app.goo.gl/MCniysdF7PJeCG9V9", "1111.gif","src/test/downloadedImages");
    }

    public static void download(String urlString, String s, String s1) throws Exception {
        // построить URL
        URL url = new URL(urlString);
        // открыть соединение
        URLConnection con = url.openConnection();
        // Установка запроса 5s
        con.setConnectTimeout(5*1000);
        // входной поток
        InputStream is = con.getInputStream();

        // 1k Буфер данных
        byte[] bs = new byte[1024];
        // Читайте длину данных
        int len;
        // Поток вывода файлов
        File sf=new File(s1);
        if(!sf.exists()){
            sf.mkdirs();
        }
        OutputStream os = new FileOutputStream(sf.getPath()+"/"+s);
        // начать чтение
        while ((len = is.read(bs)) != -1) {
            os.write(bs, 0, len);
        }
        // Завершено, закрыть все ссылки
        os.close();
        is.close();
    }


}