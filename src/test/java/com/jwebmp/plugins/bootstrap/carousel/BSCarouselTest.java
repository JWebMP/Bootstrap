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

import com.jwebmp.plugins.bootstrap.carousel.parts.*;
import org.junit.jupiter.api.*;

/**
 * @author GedMarc
 */
public class BSCarouselTest

{
	
	public BSCarouselTest()
	{
	}
	
	@Test
	public void testSomeMethod()
	{
		
		BSCarousel<?> car = new BSCarousel();
		
		System.out.println(car.toString(true));
	}
	
	@Test
	public void testOnDemand()
	{
		BSCarousel<?> car = new BSCarousel();
		BSCarouselSlide ci = new BSCarouselSlide();
		ci.add(new BSCarouselCaption("Caption"));
		car.addSlide(ci);
		
		System.out.println(car.toString(0));
	}
	
}
