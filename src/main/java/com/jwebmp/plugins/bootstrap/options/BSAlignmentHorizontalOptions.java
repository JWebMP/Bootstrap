package com.jwebmp.plugins.bootstrap.options;

import com.fasterxml.jackson.annotation.JsonValue;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * Vertical alignment
 * <p>
 * Change the alignment of elements with the vertical-alignment utilities.
 * <p>
 * Please note that vertical-align only affects inline, inline-block, inline-table, and table cell elements.
 * <p>
 * Choose from .align-baseline, .align-top, .align-middle, .align-bottom, .align-text-bottom, and .align-text-top as needed.
 *
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
public enum BSAlignmentHorizontalOptions
		implements IBSComponentOptions
{
	/**
	 * Change the alignment of elements with the vertical-alignment utilities.
	 * <p>
	 * Please note that vertical-align only affects inline, inline-block, inline-table, and table cell elements.
	 * <p>
	 * Choose from .align-baseline, .align-top, .align-middle, .align-bottom, .align-text-bottom, and .align-text-top as needed.
	 */
	Align_Around("justify-content-around"),
	/**
	 * Change the alignment of elements with the vertical-alignment utilities.
	 * <p>
	 * Please note that vertical-align only affects inline, inline-block, inline-table, and table cell elements.
	 * <p>
	 * Choose from .align-baseline, .align-top, .align-middle, .align-bottom, .align-text-bottom, and .align-text-top as needed.
	 */
	Align_Between("justify-content-between"),
	/**
	 * Change the alignment of elements with the vertical-alignment utilities.
	 * <p>
	 * Please note that vertical-align only affects inline, inline-block, inline-table, and table cell elements.
	 * <p>
	 * Choose from .align-baseline, .align-top, .align-middle, .align-bottom, .align-text-bottom, and .align-text-top as needed.
	 */
	Align_Left("justify-content-start"),
	/**
	 * Change the alignment of elements with the vertical-alignment utilities.
	 * <p>
	 * Please note that vertical-align only affects inline, inline-block, inline-table, and table cell elements.
	 * <p>
	 * Choose from .align-baseline, .align-top, .align-middle, .align-bottom, .align-text-bottom, and .align-text-top as needed.
	 */
	Align_Center("justify-content-center"),
	/**
	 * Change the alignment of elements with the vertical-alignment utilities.
	 * <p>
	 * Please note that vertical-align only affects inline, inline-block, inline-table, and table cell elements.
	 * <p>
	 * Choose from .align-baseline, .align-top, .align-middle, .align-bottom, .align-text-bottom, and .align-text-top as needed.
	 */
	Align_Right("justify-content-end");

	private String bootstrap4Version;

	BSAlignmentHorizontalOptions(String bootstrap4Version)
	{
		//Nothing needed
		this.bootstrap4Version = bootstrap4Version;
	}

	@JsonValue
	@Override
	public String toString()
	{
		return bootstrap4Version.toLowerCase()
		                        .replaceAll("\\$", STRING_SPACE)
		                        .replace(CHAR_UNDERSCORE, CHAR_DASH);

	}
}
