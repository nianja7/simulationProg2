package Space;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;

@AllArgsConstructor
@NoArgsConstructor
@Data
abstract class Space {
    protected double volume;
    protected int capacity;

    public void showDimensions(Space s){
        System.out.println("Volume : "+s.volume);
        System.out.println("Capacity : " + s.capacity);
    }
}
