/**

Buddha Quotes
Copyright (C) 2021  BanDev

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <https://www.gnu.org/licenses/>.

 */

package org.bandev.buddhaquotes.core

import org.bandev.buddhaquotes.R

object Images {

    fun heart(liked: Boolean): Int {
        return if (liked) R.drawable.ic_heart_red else R.drawable.ic_heart_outline
    }

    const val MONK: Int = 1
    const val DHARMA_WHEEL: Int = 2
    const val ANAHATA: Int = 3
    const val MANDALA: Int = 4
    const val ENDLESS_KNOT: Int = 5
    const val ELEPHANT: Int = 6
    const val TEMPLE: Int = 7
    const val LAMP: Int = 8
    const val SHRINE: Int = 9
    const val LOTUS: Int = 10
    const val LOTUS_WATER: Int = 11

}