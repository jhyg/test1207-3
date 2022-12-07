package p.command;

import java.util.List;
import lombok.Data;
import lombok.ToString;
import org.axonframework.modelling.command.TargetAggregateIdentifier;
import p.query.*;

@ToString
@Data
public class CCommand {

    private Long id; // Please comment here if you want user to enter the id directly
}
