/* CompiladorTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. CompiladorTokenManager.java */

/** Token Manager. */
public class CompiladorTokenManager implements CompiladorConstants {

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0xa1fe0L) != 0L)
         {
            jjmatchedKind = 13;
            return 0;
         }
         return -1;
      case 1:
         if ((active0 & 0xa1fe0L) != 0L)
         {
            jjmatchedKind = 13;
            jjmatchedPos = 1;
            return 0;
         }
         return -1;
      case 2:
         if ((active0 & 0xa1fe0L) != 0L)
         {
            jjmatchedKind = 13;
            jjmatchedPos = 2;
            return 0;
         }
         return -1;
      case 3:
         if ((active0 & 0xa1fe0L) != 0L)
         {
            jjmatchedKind = 13;
            jjmatchedPos = 3;
            return 0;
         }
         return -1;
      case 4:
         if ((active0 & 0xa1fe0L) != 0L)
         {
            jjmatchedKind = 13;
            jjmatchedPos = 4;
            return 0;
         }
         return -1;
      case 5:
         if ((active0 & 0x20L) != 0L)
            return 0;
         if ((active0 & 0xa1fc0L) != 0L)
         {
            jjmatchedKind = 13;
            jjmatchedPos = 5;
            return 0;
         }
         return -1;
      case 6:
         if ((active0 & 0xa1fc0L) != 0L)
         {
            jjmatchedKind = 13;
            jjmatchedPos = 6;
            return 0;
         }
         return -1;
      case 7:
         if ((active0 & 0x800L) != 0L)
            return 0;
         if ((active0 & 0x817c0L) != 0L)
         {
            jjmatchedKind = 13;
            jjmatchedPos = 7;
            return 0;
         }
         return -1;
      case 8:
         if ((active0 & 0x2c0L) != 0L)
            return 0;
         if ((active0 & 0x1500L) != 0L)
         {
            jjmatchedKind = 13;
            jjmatchedPos = 8;
            return 0;
         }
         return -1;
      case 9:
         if ((active0 & 0x1500L) != 0L)
         {
            jjmatchedKind = 13;
            jjmatchedPos = 9;
            return 0;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 36:
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 41:
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 42:
         return jjStopAtPos(0, 30);
      case 43:
         return jjStopAtPos(0, 28);
      case 44:
         return jjStopAtPos(0, 21);
      case 45:
         return jjStopAtPos(0, 29);
      case 47:
         return jjStopAtPos(0, 31);
      case 59:
         return jjStopAtPos(0, 16);
      case 60:
         return jjStopAtPos(0, 26);
      case 61:
         jjmatchedKind = 15;
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 62:
         return jjStopAtPos(0, 27);
      case 102:
         return jjMoveStringLiteralDfa1_0(0xa0000L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x1e00L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x60L);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 125:
         return jjStopAtPos(0, 18);
      default :
         return jjMoveNfa_0(4, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x21e00L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x100160L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x1080000L);
      case 112:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x80L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000L);
      case 104:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x500040L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x120L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x80200L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x1c80L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000L);
      case 122:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x80260L);
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      case 103:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x1020000L);
      case 109:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000L);
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x1c00L);
      case 112:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000L);
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x80L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 36:
         if ((active0 & 0x2000000L) != 0L)
            return jjStopAtPos(4, 25);
         break;
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x100000L);
      case 98:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000L);
      case 101:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x400L);
      case 111:
         return jjMoveStringLiteralDfa5_0(active0, 0x2c0L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x800L);
      case 115:
         return jjMoveStringLiteralDfa5_0(active0, 0x10a0000L);
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x120L);
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x400000L);
      case 101:
         return jjMoveStringLiteralDfa6_0(active0, 0x800900L);
      case 110:
         return jjMoveStringLiteralDfa6_0(active0, 0x400L);
      case 111:
         if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(5, 5, 0);
         else if ((active0 & 0x100000L) != 0L)
            return jjStopAtPos(5, 20);
         break;
      case 112:
         return jjMoveStringLiteralDfa6_0(active0, 0x2c0L);
      case 115:
         return jjMoveStringLiteralDfa6_0(active0, 0x10a1000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa7_0(active0, 0xac0L);
      case 99:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000L);
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x80000L);
      case 108:
         return jjMoveStringLiteralDfa7_0(active0, 0x400000L);
      case 109:
         return jjMoveStringLiteralDfa7_0(active0, 0x800000L);
      case 111:
         return jjMoveStringLiteralDfa7_0(active0, 0x1020100L);
      case 116:
         return jjMoveStringLiteralDfa7_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x800000L) != 0L)
            return jjStopAtPos(7, 23);
         break;
      case 61:
         if ((active0 & 0x400000L) != 0L)
            return jjStopAtPos(7, 22);
         break;
      case 101:
         return jjMoveStringLiteralDfa8_0(active0, 0x400L);
      case 108:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(7, 11, 0);
         break;
      case 109:
         return jjMoveStringLiteralDfa8_0(active0, 0x80000L);
      case 112:
         return jjMoveStringLiteralDfa8_0(active0, 0x100L);
      case 114:
         return jjMoveStringLiteralDfa8_0(active0, 0x1000L);
      case 116:
         return jjMoveStringLiteralDfa8_0(active0, 0x2c0L);
      case 123:
         if ((active0 & 0x20000L) != 0L)
            return jjStopAtPos(7, 17);
         break;
      case 124:
         if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(7, 24);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 40:
         if ((active0 & 0x80000L) != 0L)
            return jjStopAtPos(8, 19);
         break;
      case 97:
         return jjMoveStringLiteralDfa9_0(active0, 0x100L);
      case 105:
         return jjMoveStringLiteralDfa9_0(active0, 0x1400L);
      case 111:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(8, 6, 0);
         else if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(8, 7, 0);
         else if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(8, 9, 0);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjMoveStringLiteralDfa9_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 114:
         return jjMoveStringLiteralDfa10_0(active0, 0x400L);
      case 116:
         return jjMoveStringLiteralDfa10_0(active0, 0x1100L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
static private int jjMoveStringLiteralDfa10_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 111:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(10, 8, 0);
         else if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(10, 10, 0);
         else if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(10, 12, 0);
         break;
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 4;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 4:
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 14)
                     kind = 14;
                  { jjCheckNAddTwoStates(1, 2); }
                  break;
               case 2:
                  if (curChar == 46)
                     { jjCheckNAdd(3); }
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 14)
                     kind = 14;
                  { jjCheckNAdd(3); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 4:
               case 0:
                  if ((0x7fffffe00000000L & l) == 0L)
                     break;
                  kind = 13;
                  { jjCheckNAdd(0); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 4 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\163\145\160\141\164\157", 
"\163\145\156\141\157\160\141\164\157", "\157\165\164\162\157\160\141\164\157", 
"\162\145\160\145\164\145\157\160\141\164\157", "\160\141\162\141\157\160\141\164\157", 
"\160\141\164\157\151\156\164\145\151\162\157", "\160\141\164\157\162\145\141\154", 
"\160\141\164\157\145\163\143\162\151\164\157", null, null, "\75", "\73", "\146\141\172\151\163\163\157\173", "\175", 
"\146\157\162\141\163\163\151\155\50", "\51\145\156\164\141\157", "\54", "\75\151\156\147\165\141\154\75", 
"\46\164\141\155\142\145\155\46", "\174\157\165\151\163\163\157\174", "\44\160\150\160\44", "\74", "\76", "\53", 
"\55", "\52", "\57", };
static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}
static final int[] jjnextStates = {0
};

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(Exception e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

    /** Constructor. */
    public CompiladorTokenManager(SimpleCharStream stream){

      if (input_stream != null)
        throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);

    input_stream = stream;
  }

  /** Constructor. */
  public CompiladorTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  
  static public void ReInit(SimpleCharStream stream)
  {


    jjmatchedPos =
    jjnewStateCnt =
    0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  static private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 4; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream, int lexState)
  
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public static void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }


/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0xffffffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
static final long[] jjtoSpecial = {
   0x0L, 
};
static final long[] jjtoMore = {
   0x0L, 
};
    static protected SimpleCharStream  input_stream;

    static private final int[] jjrounds = new int[4];
    static private final int[] jjstateSet = new int[2 * 4];
    private static final StringBuilder jjimage = new StringBuilder();
    private static StringBuilder image = jjimage;
    private static int jjimageLen;
    private static int lengthOfMatch;
    static protected int curChar;
}