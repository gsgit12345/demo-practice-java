package org.example.jdk17feature.sealedclasses;

sealed class Amount permits amountdoller,amountinr,amountusd{
}
final class amountdoller extends  Amount
{

}
sealed class amountinr extends  Amount permits  amountcad
{

}
non-sealed class amountusd extends  Amount
{

}