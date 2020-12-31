/*****************************************************************************************
                                     Alexir 
Copyright (C) 2020 Usama S Erawab <usamaerawab@gmail.com> Libya
This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.
This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.
You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA
************************************************************************************************/
package alexir;

import java.util.List;
import java.util.Map;

/**
 *
 * @author alrawab
 */
abstract class Marker {
   protected String ChrLocation = null;
    protected String LocusName = null;
    protected String Other_Names = null;
    protected String cygen_location = null;
    protected String Phys_Pos = null;
    protected String Strct_Gene = null;
    protected String Repcat = null;
    protected String RepMotif = null;
    protected List Allelic_Ladders = null;
    protected Map MALLEL_formula = null;
    protected Map ALLEL_SEQ_ABV_map = null;
    protected Map ALLEL_SEQ_FORMULA_map = null;
    protected Double Mutation_rate = null;
    protected List Common_Multiplexes = null;
    protected List GenBank_Accession = null;
    protected Map MAlleleVariants = null;  
}
