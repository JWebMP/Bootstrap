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
public enum BSAlignmentVerticalOptions
		implements IBSComponentOptions
{
	/**
	 * Change the alignment of elements with the vertical-alignment utilities.
	 * <p>
	 * Please note that vertical-align only affects inline, inline-block, inline-table, and table cell elements.
	 * <p>
	 * Choose from .align-baseline, .align-top, .align-middle, .align-bottom, .align-text-bottom, and .align-text-top as needed.
	 */
	Align_Top("align-items-start"),
	/**
	 * Change the alignment of elements with the vertical-alignment utilities.
	 * <p>
	 * Please note that vertical-align only affects inline, inline-block, inline-table, and table cell elements.
	 * <p>
	 * Choose from .align-baseline, .align-top, .align-middle, .align-bottom, .align-text-bottom, and .align-text-top as needed.
	 */
	Align_Middle("align-items-center"),
	/**
	 * Change the alignment of elements with the vertical-alignment utilities.
	 * <p>
	 * Please note that vertical-align only affects inline, inline-block, inline-table, and table cell elements.
	 * <p>
	 * Choose from .align-baseline, .align-top, .align-middle, .align-bottom, .align-text-bottom, and .align-text-top as needed.
	 */
	Align_Bottom("align-items-end"),

	/**
	 * Change the alignment of elements with the vertical-alignment utilities.
	 * <p>
	 * Please note that vertical-align only affects inline, inline-block, inline-table, and table cell elements.
	 * <p>
	 * Choose from .align-baseline, .align-top, .align-middle, .align-bottom, .align-text-bottom, and .align-text-top as needed.
	 */
	Align_Self_Top("align-self-start"),
	/**
	 * Change the alignment of elements with the vertical-alignment utilities.
	 * <p>
	 * Please note that vertical-align only affects inline, inline-block, inline-table, and table cell elements.
	 * <p>
	 * Choose from .align-baseline, .align-top, .align-middle, .align-bottom, .align-text-bottom, and .align-text-top as needed.
	 */
	Align_Self_Middle("align-self-center"),
	/**
	 * Change the alignment of elements with the vertical-alignment utilities.
	 * <p>
	 * Please note that vertical-align only affects inline, inline-block, inline-table, and table cell elements.
	 * <p>
	 * Choose from .align-baseline, .align-top, .align-middle, .align-bottom, .align-text-bottom, and .align-text-top as needed.
	 */
	Align_Self_Bottom("align-self-end"),
	;

	private String bootstrap4Version;

	BSAlignmentVerticalOptions(String bootstrap4Version)
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
