/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.bootstrap.options;

import com.fasterxml.jackson.annotation.JsonValue;

import static com.guicedee.guicedinjection.json.StaticStrings.*;

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
