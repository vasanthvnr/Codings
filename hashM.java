import java.util.HashMap;
import java.util.Map;

public class hashM {
    public static void main(String[] args) {
        Map<Integer, String> vm=new HashMap<>();//uplaying with hashmap
        vm.put(2,"Apple");
        vm.put(3,"Grapes");
        vm.put(4,"orange");
        System.out.println(vm);
        vm.remove(4);
        System.out.println(vm);
        vm.replace(3,"Banana");
        System.out.println(vm.get(3));
        System.out.println(vm.size());

        vm.put(4,"Cherry");
        System.out.println(vm.get(4));
        vm.clear();
        System.out.println(vm.size());
    }
}
