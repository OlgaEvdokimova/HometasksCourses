package com.company.cloneSerializ.externaliz;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Cat extends Animal implements Externalizable {
    private String nickName;
    private String breed;
    public Cat(){};

    public Cat(String color, int weight, int age, String nickName, String breed) {
        super(color, weight, age);
        this.nickName = nickName;
        this.breed = breed;
    }


    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        super.writeExternal(out);
        out.writeObject(this.nickName);
        out.writeObject(this.breed);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        super.readExternal(in);
        nickName = (String) in.readObject();
        breed = (String) in.readObject();

    }

    @Override
    public boolean isCat() {
        return true;
    }

    @Override
    public boolean isHorse() {
        return false;
    }
    @Override
    public String toString() {
        return "Cat{" + super.toString()+
                "nickName='" + nickName + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
