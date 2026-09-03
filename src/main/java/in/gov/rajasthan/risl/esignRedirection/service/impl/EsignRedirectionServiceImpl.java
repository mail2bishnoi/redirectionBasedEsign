package in.gov.rajasthan.risl.esignRedirection.service.impl;

import in.gov.rajasthan.risl.esignRedirection.model.MerchantRequestLog;
import in.gov.rajasthan.risl.esignRedirection.repository.MerchantRequestLogRepository;
import in.gov.rajasthan.risl.esignRedirection.service.MerchantRequestLogService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class EsignRedirectionServiceImpl implements MerchantRequestLogService {

    private final MerchantRequestLogRepository merchantRequestLogRepository;

    @Override
    public MerchantRequestLog createMerchantRequestLog(MerchantRequestLog merchantRequestLog) {

        merchantRequestLog.setRequestId(UUID.randomUUID().toString());

        log.info("Saving request, requestId={}, aspId={}, applicationId={}",
                merchantRequestLog.getRequestId(),
                merchantRequestLog.getAspId(),
                merchantRequestLog.getApplicationId());

        return merchantRequestLogRepository.save(merchantRequestLog);
    }
}