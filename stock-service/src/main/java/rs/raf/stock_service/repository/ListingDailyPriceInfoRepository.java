package rs.raf.stock_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.raf.stock_service.domain.entity.Listing;
import rs.raf.stock_service.domain.entity.ListingDailyPriceInfo;

import java.util.List;

@Repository
public interface ListingDailyPriceInfoRepository extends JpaRepository<ListingDailyPriceInfo, Long> {
    ListingDailyPriceInfo findTopByListingOrderByDateDesc(Listing listing);

    List<ListingDailyPriceInfo> findAllByListingOrderByDateDesc(Listing listing);
}
