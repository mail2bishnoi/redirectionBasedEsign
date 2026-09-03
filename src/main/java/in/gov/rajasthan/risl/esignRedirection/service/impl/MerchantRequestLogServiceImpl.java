package in.gov.rajasthan.risl.esignRedirection.service.impl;

import in.gov.rajasthan.risl.esignRedirection.model.MerchantRequestLog;
import in.gov.rajasthan.risl.esignRedirection.service.MerchantRequestLogService;
import org.springframework.stereotype.Service;

@Service
public class MerchantRequestLogServiceImpl implements MerchantRequestLogService {


    @Override
    public MerchantRequestLog createMerchantRequestLog(MerchantRequestLog merchantRequestLog) {
        return merchantRequestLog;
    }
}
