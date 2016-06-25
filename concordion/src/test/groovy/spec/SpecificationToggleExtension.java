package spec;

import org.concordion.api.Resource;
import org.concordion.api.extension.ConcordionExtender;
import org.concordion.api.extension.ConcordionExtension;

public class SpecificationToggleExtension implements ConcordionExtension {

    @Override
    public void addTo(ConcordionExtender concordionExtender) {
        concordionExtender.withResource("/concordion.css", new Resource("/concordion.css"));
    }

}
