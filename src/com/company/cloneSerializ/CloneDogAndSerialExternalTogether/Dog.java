package com.company.cloneSerializ.CloneDogAndSerialExternalTogether;


public class Dog extends Animal implements Cloneable{
    private String nickName;
    private DogBreedEnum breedEnum;
    private DogBreedClass breedClass;
    private boolean isTakePartExhibition;

    public Dog(String color, int weight, int age, String nickName, DogBreedEnum breed, DogBreedClass breedClass, boolean isTakePartExhibition) {
        super(color, weight, age);
        this.nickName = nickName;
        this.breedEnum = breed;
        this.breedClass = breedClass;
        this.isTakePartExhibition = isTakePartExhibition;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Dog dog = (Dog) super.clone();
        dog.breedClass = (DogBreedClass) breedClass.clone();
        return dog;
    }

    public boolean isTakePartExhibition() {
        return isTakePartExhibition;
    }

    public void setTakePartExhibition(boolean takePartExhibition) {
        isTakePartExhibition = takePartExhibition;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public DogBreedEnum getBreedEnum() {
        return breedEnum;
    }

    public void setBreedEnum(DogBreedEnum breed) {
        this.breedEnum = breed;
    }

    public DogBreedClass getBreedClass() {
        return breedClass;
    }

    public void setBreedClass(DogBreedClass breedClass) {
        this.breedClass = breedClass;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "nickName='" + nickName + '\'' +
                ", breedEnum=" + breedEnum +
                ", breedClass=" + breedClass +
                ", isTakePartExhibition=" + isTakePartExhibition +
                '}';
    }
}

//получается enam не надо имплементить Cloneable, потому что метод клон() не поставить ему, а ка коно тогда глубоко клонируется?
enum DogBreedEnum {
    BIGL,
    SPANIEL,
    TERRIER
}
