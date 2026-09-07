package algos;

import org.springframework.stereotype.Component;

@Component
public class AlgosWrapper {
    Algos a;
    public AlgosWrapper(Algos a) {
        this.a = a;
    }
    public void caller(int[] arr) {
        a.sort(arr);
    }
    public int caller(int[] arr, int data) {
        return a.search(arr, data);
    }
}
