package org.monarchinitiative.hpotextmining.model;

import java.util.Set;

/**
 * Classes that implement this interface are POJOs which contain results from HPO text-mining analysis. Created by
 * Daniel Danis on 6/19/17.
 */
public interface TextMiningResult {

    /**
     * Get PMID of the scientific publication which is the source of analyzed text.
     *
     * @return String PMID
     */
    String getPMID();

    /**
     * Get set of curator-approved <em>YES</em> and <em>NOT</em> HPO terms.
     *
     * @return set of {@link PhenotypeTerm} objects.
     */
    Set<PhenotypeTerm> getPhenotypeTerms();

}
