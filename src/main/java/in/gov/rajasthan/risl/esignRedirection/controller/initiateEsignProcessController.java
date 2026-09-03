package in.gov.rajasthan.risl.esignRedirection.controller;

import in.gov.rajasthan.risl.esignRedirection.model.MerchantRequestLog;
import in.gov.rajasthan.risl.esignRedirection.service.MerchantRequestLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/public")
public class initiateEsignProcessController {

    @Autowired
    private MerchantRequestLogService merchantRequestLogService;

    @PostMapping(value = "/initiateEsign", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public MerchantRequestLog initiateEsign(@ModelAttribute MerchantRequestLog merchantRequestLog) {
        return merchantRequestLogService.createMerchantRequestLog(merchantRequestLog);
    }
}
