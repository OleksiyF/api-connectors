/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.model.Chat
import io.swagger.client.model.ChatChannel
import io.swagger.client.model.ConnectedUsers
import io.swagger.client.model.Error
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object ChatApi {

  /**
   * 
   * 
   * Expected answers:
   *   code 200 : Seq[Chat] (Request was successful)
   *   code 400 : Error (Parameter Error)
   *   code 401 : Error (Unauthorized)
   *   code 404 : Error (Not Found)
   * 
   * @param count Number of results to fetch.
   * @param start Starting ID for results.
   * @param reverse If true, will sort results newest first.
   * @param channelID Channel id. GET /chat/channels for ids. Leave blank for all.
   */
  def chat.get(count: Option[Double], start: Option[Double], reverse: Option[Boolean], channelID: Option[Double] = None): ApiRequest[Seq[Chat]] =
    ApiRequest[Seq[Chat]](ApiMethods.GET, "https://localhost/api/v1", "/chat", "application/json")
      .withQueryParam("count", count)
      .withQueryParam("start", start)
      .withQueryParam("reverse", reverse)
      .withQueryParam("channelID", channelID)
      .withSuccessResponse[Seq[Chat]](200)
      .withErrorResponse[Error](400)
      .withErrorResponse[Error](401)
      .withErrorResponse[Error](404)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : Seq[ChatChannel] (Request was successful)
   *   code 400 : Error (Parameter Error)
   *   code 401 : Error (Unauthorized)
   *   code 404 : Error (Not Found)
   */
  def chat.getChannels(): ApiRequest[Seq[ChatChannel]] =
    ApiRequest[Seq[ChatChannel]](ApiMethods.GET, "https://localhost/api/v1", "/chat/channels", "application/json")
      .withSuccessResponse[Seq[ChatChannel]](200)
      .withErrorResponse[Error](400)
      .withErrorResponse[Error](401)
      .withErrorResponse[Error](404)
        /**
   * Returns an array with browser users in the first position and API users (bots) in the second position.
   * 
   * Expected answers:
   *   code 200 : ConnectedUsers (Request was successful)
   *   code 400 : Error (Parameter Error)
   *   code 401 : Error (Unauthorized)
   *   code 404 : Error (Not Found)
   */
  def chat.getConnected(): ApiRequest[ConnectedUsers] =
    ApiRequest[ConnectedUsers](ApiMethods.GET, "https://localhost/api/v1", "/chat/connected", "application/json")
      .withSuccessResponse[ConnectedUsers](200)
      .withErrorResponse[Error](400)
      .withErrorResponse[Error](401)
      .withErrorResponse[Error](404)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : Chat (Request was successful)
   *   code 400 : Error (Parameter Error)
   *   code 401 : Error (Unauthorized)
   *   code 404 : Error (Not Found)
   * 
   * Available security schemes:
   *   apiKey (apiKey)
   *   apiNonce (apiKey)
   *   apiSignature (apiKey)
   * 
   * @param message 
   * @param channelID Channel to post to. Default 1 (English).
   */
  def chat.new(message: String, channelID: Option[Double])(implicit apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue): ApiRequest[Chat] =
    ApiRequest[Chat](ApiMethods.POST, "https://localhost/api/v1", "/chat", "application/json")
      .withApiKey(apiKey, "api-key", HEADER)
      .withApiKey(apiKey, "api-nonce", HEADER)
      .withApiKey(apiKey, "api-signature", HEADER)
      .withFormParam("message", message)
      .withFormParam("channelID", channelID)
      .withSuccessResponse[Chat](200)
      .withErrorResponse[Error](400)
      .withErrorResponse[Error](401)
      .withErrorResponse[Error](404)
      

}

