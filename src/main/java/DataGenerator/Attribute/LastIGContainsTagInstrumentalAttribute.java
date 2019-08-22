package DataGenerator.Attribute;

import MorphologicalAnalysis.MorphologicalParse;
import MorphologicalAnalysis.MorphologicalTag;

public class LastIGContainsTagInstrumentalAttribute extends LastIGContainsTagAttribute {

	/**
	 * Binary attribute for a given word. If the last inflectional group of the word contains INSTRUMENTAL tag,
	 * the attribute will be "true", otherwise "false".
	 * @param parse Morphological parse of the word.
	 */
	public LastIGContainsTagInstrumentalAttribute(MorphologicalParse parse){
		super(parse, MorphologicalTag.INSTRUMENTAL);
	}
}
