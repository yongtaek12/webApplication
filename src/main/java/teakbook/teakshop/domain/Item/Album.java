package teakbook.teakshop.domain.Item;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("A")

@Getter @Setter
public class Album extends Item{
    private String artists;

}
