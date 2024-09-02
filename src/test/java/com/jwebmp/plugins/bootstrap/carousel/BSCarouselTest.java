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
package com.jwebmp.plugins.bootstrap.carousel;

import com.jwebmp.core.base.angular.client.annotations.angular.*;
import com.jwebmp.plugins.bootstrap.carousel.parts.*;

/**
 * @author GedMarc
 */
@NgComponent("carousel-test")
public class BSCarouselTest extends BSCarousel<BSCarouselTest>
{
    @Override
    protected void init()
    {
        addSlide(new BSCarouselSlide<>().add("Slide 1"));
        addSlide(new BSCarouselSlide<>().add("Slide 2"));

        super.init();
    }
}
