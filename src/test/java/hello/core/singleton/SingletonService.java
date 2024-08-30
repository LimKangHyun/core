package hello.core.singleton;

public class SingletonService {

    //딱 한 개의 객체 인스턴스만 존재해야 하므로 생성자를 private로 막아놓는다.
    private static final SingletonService instance = new SingletonService();

    /**
     * 이 객체의 인스턴스가 필요한 경우 오직 getInstance를 통해서만 조회할 수 있다. 이 메서드를 호출하면 항상
     * 같은 인스턴스를 반환한다.
     */

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {

    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
