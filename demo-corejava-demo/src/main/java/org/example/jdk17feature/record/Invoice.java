package org.example.jdk17feature.record;

public record Invoice(String id, float amount) {
  //  static String prefix = String.valueOf(Calendar.getInstance().get(Calendar.YEAR))
    //        +String.valueOf(Calendar.getInstance().get(Calendar.MONTH)+1);

    public Invoice(String id, float amount){
     //   this.id=prefix+id.trim();
        this.id=id;
        this.amount=amount;
    }
}

