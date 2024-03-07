package jeongsoek;

public class Abstract3 extends Abstract{
    @Override
    public void printDefinition() {
        System.out.println("추상 메서드는 메서드의 선언부와 구현부 중 선언부만 작성되어있다.");
        System.out.println("굳이 abstract키워드를 사용하는 것은 강제성을 위해서이다.");
    }
}
