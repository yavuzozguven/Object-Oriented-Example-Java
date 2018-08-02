package prolab2proje2;
public abstract class Arac {
       private String marka,yil,fiyat,renk,yakit,tekerlek,yolcu;
int hiz;
   
public String getRenk(){
    return renk;
}    
public void setRenk(String renk) {
        this.renk = renk;
}


public String getMarka() {
        return marka;
}
public void setMarka(String marka) {
        this.marka = marka;
}

    
public String getYil(){
    return yil;
}
public void setYil(String yil){
    this.yil=yil;
}


public String getFiyat(){
    return fiyat;
}
public void setFiyat(String fiyat){
    this.fiyat=fiyat;
}


public int getHiz(){
    return hiz;
}
public void setHiz(int hiz){
    this.hiz=hiz;
}

public String getYakit(){
    return yakit;
} 
public void setYakit(String yakit){
    this.yakit=yakit;
}

public String getTekerlek(){
    return tekerlek;
}

public void setTekerlek(String tekerlek){
    this.tekerlek=tekerlek;
}

public String getYolcu(){
    return yolcu;
}

public void setYolcu(String yolcu){
    this.yolcu=yolcu;
}





public abstract int hizlan(int al);
public abstract int yavasla(int al);
public abstract int dur();

    
}
