import scala.concurrent.duration.DurationInt
import scala.util.Random

 val random = new Random(4)
 val busyTimeScale = 10
 def calculateRandomMillis = random.nextInt(busyTimeScale).millis

calculateRandomMillis
calculateRandomMillis
calculateRandomMillis
calculateRandomMillis
calculateRandomMillis