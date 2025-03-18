package rs.raf.stock_service.domain.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("STOCK")
public class Stock extends Listing {
    private String symbol;
    private BigDecimal price;
    private BigDecimal change;
    private long volume;
    private long outstandingShares;
    private BigDecimal dividendYield;
    private BigDecimal marketCap;
    private int contractSize = 1;
    private BigDecimal maintenanceMargin;
}