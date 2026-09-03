package in.gov.rajasthan.risl.esignRedirection.repository;

import in.gov.rajasthan.risl.esignRedirection.model.MerchantRequestLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MerchantRequestLogRepository extends JpaRepository<MerchantRequestLog, String> {
}