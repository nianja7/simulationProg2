package space;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
abstract class Space {
    protected double volume;
    protected int capacity;

    public void showDimensions(Space s){
        System.out.println("Volume : "+s.volume);
        System.out.println("Capacity : " + s.capacity);
    }
}
