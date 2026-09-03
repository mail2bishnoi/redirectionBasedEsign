package in.gov.rajasthan.risl.esignRedirection.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

/**
 * Represents the incoming API request body from a Merchant/ASP.
 *
 * Field-by-field origin (see project spec, section 6):
 *   - ASP_ID, APPLICATION_ID, VERSION, ENCRYPTED_DATA, PDF_FILE -> request body
 *
 * NOT included here:
 *   - SECRET_KEY  -> arrives as an HTTP header, not a body field, so it will
 *                    be read directly from the request in the controller/
 *                    filter, never bound onto this DTO. Keeping it out of
 *                    the DTO also avoids any risk of it being logged or
 *                    serialized accidentally (e.g. via toString()).
 *   - Request metadata (IP, User-Agent, timestamp, etc.) -> these are not
 *                    sent by the client as parameters; they'll be captured
 *                    separately from the HttpServletRequest.
 *
 * No Bean Validation annotations yet - structural validation is a later
 * step, kept separate on purpose (see spec section 15).
 *
 * Assumption: PDF_FILE is modeled here as a Spring MultipartFile, since
 * the exact transport format (multipart vs base64 vs stream) has not been
 * finalized. This will be revisited once that's confirmed.
 */
@Getter
@Setter
@ToString
public class MerchantRequestLog {

    private String aspId;
    private String applicationId;
    private String version;
    private String encryptedData;
    private MultipartFile pdfFile;
}