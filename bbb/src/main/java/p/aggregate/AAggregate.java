package p.aggregate;

import static org.axonframework.modelling.command.AggregateLifecycle.*;

import java.util.List;
import lombok.Data;
import lombok.ToString;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;
import org.springframework.beans.BeanUtils;
import p.command.*;
import p.event.*;
import p.query.*;

@Aggregate
@Data
@ToString
public class AAggregate {

    @AggregateIdentifier
    private Long id;

    public AAggregate() {}

    @CommandHandler
    public AAggregate(CCommand command) {}

    @EventSourcingHandler
    public void on(E2Event event) {
        BeanUtils.copyProperties(event, this);
    }
}
