package in.gov.rajasthan.risl.esignRedirection.controller;

import in.gov.rajasthan.risl.esignRedirection.model.MerchantRequestLog;
import in.gov.rajasthan.risl.esignRedirection.service.MerchantRequestLogService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/public")
public class initiateEsignProcessController {

    @Autowired
    private final MerchantRequestLogService merchantRequestLogService;

    @PostMapping(value = "/initiateEsign", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public MerchantRequestLog initiateEsign(@ModelAttribute MerchantRequestLog merchantRequestLog) {
        return merchantRequestLogService.createMerchantRequestLog(merchantRequestLog);
    }
}
