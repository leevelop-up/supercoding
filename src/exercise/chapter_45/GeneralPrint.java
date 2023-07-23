package exercise.chapter_45;

public class GeneralPrint<T> {
    private T material;

    public void printMyInfo(){
        System.out.println(material + "를 출력합니다.");
    }

    public void setMaterial(T material){
        this.material = material;
    }

    public T getMaterial(){
        return this.material;
    }
}

/*

    Static에서는 generic 적용 불가능
    static은 클래스 로드 시점에 동작
    generic은 인스턴스 생성 시점에 동작


 */